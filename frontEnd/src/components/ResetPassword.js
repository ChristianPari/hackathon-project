import React from "react";

function ResetPassword() {
  //add logic to passwords
  return (
    <section id="resetPassword">
      <h5>Reset Password</h5>

      <h4>Please enter old password:</h4>
      <label for="backend">Old Password</label>
      <input type="text" placeholder="Old Password" />

      <br />
      <br />

      <label for="backend">New Password</label>
      <input type="text" placeholder="New Password" />

      <br />

      <label for="backend">Re-enter New Password</label>
      <input type="text" placeholder="New Password" />

      <br />

      <button type="submit">Submit</button>
    </section>
  );
}

export default ResetPassword;
