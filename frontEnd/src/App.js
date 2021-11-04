import "./App.css";
import Login from "./components/Login";
import Form from "./components/Form";
import ActiveTickets from "./components/ActiveTickets";
import ResetPassword from "./components/ResetPassword";

import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

function App() {
  return (
    <Router>
      <h1>Possible routes:</h1>
      <p>/ - home login</p>
      <p>/form</p>
      <p>/activetickets</p>
      <p>/resetpassword</p>
      <div className="App">
        <Switch>
          <Route path="/form">
            <Form />
          </Route>
          <Route path="/activetickets">
            <ActiveTickets />
          </Route>
          <Route path="/resetpassword">
            <ResetPassword />
          </Route>
          <Route path="/">
            <Login />
          </Route>
        </Switch>
      </div>
    </Router>
  );
}

export default App;
