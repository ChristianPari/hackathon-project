import React from "react";

//department
//status
//responses
//title
//content
function Form() {
  return (
    <section id="form">
      <form>
        <h5>Department</h5>
        <input
          type="radio"
          name="department"
          value="general"
          id="general"
          required
        />
        <label for="general">General</label>
        <input type="radio" name="department" value="frontend" id="frontend" />
        <label for="frontend">Front End</label>
        <input type="radio" name="department" value="backend" id="backend" />
        <label for="backend">Back End</label>

        <h5>
          <label for="status">Status:</label>
        </h5>
        <select name="status" id="status">
          <option value="active">Active</option>
          <option value="inactive">Inactive</option>
        </select>

        <h5>
          <label for="title">Title</label>
        </h5>
        <input type="text" id="title" name="title" />

        <h5>
          <label for="content">Content</label>
        </h5>
        <textarea id="w3review" name="w3review" rows="4" cols="50">
          Please specify the issue.
        </textarea>
        <br />
        <input type="submit" value="Submit"></input>
      </form>
    </section>
  );
}

export default Form;
