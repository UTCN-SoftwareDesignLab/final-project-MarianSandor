import React, { useState } from "react";
import style from "../components.module.css";
import "bootstrap/dist/css/bootstrap.min.css";
import { Form, Button } from "react-bootstrap";
import { useHistory } from "react-router-dom";
import { AuthenticationService } from "../../api/services/Authentication";

const LoginForm = ({ setLogin }) => {
  let history = useHistory();

  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const loginHandler = async (e) => {
    e.preventDefault();

    let loginRequest = {
      username: username,
      password: password,
    };

    AuthenticationService.login(loginRequest)
      .then((value) => {
        if (value && value.token) {
          if (value.roles[0] === "ADMIN") history.push("/administrator");
          else if (value.roles[0] === "EMPLOYEE") {
            history.push("/employee");
          } else if (value.roles[0] === "CUSTOMER") {
            history.push("/customer");
          }
        }
      })
      .catch((error) => {
        console.error("Failed to login! " + error.message);
      });

    setUsername("");
    setPassword("");
  };

  return (
    <div className={style.userModal}>
      <Form onSubmit={loginHandler}>
        <Form.Group controlId="formBasicUsername">
          <Form.Label>Username</Form.Label>
          <Form.Control
            type="username"
            placeholder="username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />
        </Form.Group>

        <Form.Group controlId="formBasicPassword">
          <Form.Label>Password</Form.Label>
          <Form.Control
            type="password"
            placeholder="Password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </Form.Group>

        <Button variant="primary" type="submit">
          Login
        </Button>
      </Form>

      <h6>Don't have an account yet?</h6>

      <Button variant="primary" type="button" onClick={() => setLogin(false)}>
        Register
      </Button>
    </div>
  );
};

export default LoginForm;
