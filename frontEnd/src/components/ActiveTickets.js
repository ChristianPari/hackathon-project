import React from "react";

function ActiveTickets() {
  //ADD LOGIC TO SHOW CURRENT TICKETS

  return (
    <section id="activeTickets">
      <h5>
        <label for="content">Current Tickets:</label>
      </h5>
      <table style={{ marginLeft: "auto", marginRight: "auto" }}>
        <tr>
          <th>Ticket ID</th>
          <th>Title</th>
          <th>Status</th>
        </tr>
        <tr>
          <td>test1</td>
          <td>test2</td>
          <td>test3</td>
        </tr>
      </table>
      <br />
      <button type="button">Create new ticket</button>
    </section>
  );
}

export default ActiveTickets;
