import React, { useState } from "react";
import { Link } from "react-router-dom";

function Login() {
  const [emailPart1, setEmailPart1] = useState("");
  const [emailPart2, setEmailPart2] = useState("");
  const [password, setPassword] = useState("");

  const setEmail = () => {
    return emailPart1 + emailPart2;
  };

  const login = () => {
    const firstName = emailPart1;
    const lastName = emailPart2;
    const email = setEmail();
  };

  return (
    <div>
      <section id="login">
        <img
          src="https://i.imgur.com/6iC52wB.png"
          alt="Hackaton"
          className="loginLogo"
        />

        <div className="loginContainer">
          <h1>Sign in</h1>
          <form>
            <h5>Department</h5>
            <input
              type="radio"
              name="department"
              value="frontend"
              id="frontend"
              required
            />
            <label for="frontend">Front End</label>
            <input
              type="radio"
              name="department"
              value="backend"
              id="backend"
            />
            <label for="backend">Back End</label>
            <br />
            <h5>E-mail</h5>
            <input
              value={emailPart1}
              onChange={(event) => setEmailPart1(event.target.value)}
              type="text"
              placeholder="First Name"
            />
            .
            <input
              value={emailPart2}
              onChange={(event) => setEmailPart2(event.target.value)}
              type="text"
              placeholder="Last Name"
            />
            @company.com
            <h5>Password</h5>
            <input
              value={password}
              onChange={(event) => setPassword(event.target.value)}
              type="password"
            />
            <button onClick={login} type="submit" className="loginSignInButton">
              Sign In
            </button>
          </form>

          <p>
            By signing-in you agree to Hackathons's Conditions of Use & Sale.
            Please see our Privacy Notice.
          </p>

          <button className="loginRegisterButton">Create Account</button>
        </div>
      </section>
    </div>
  );
}

export default Login;
