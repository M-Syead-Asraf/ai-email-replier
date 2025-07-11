
# AI Email Replier

An application that assist you write quick, smart, and context-aware email responses using AI. Ideal for saving time and to look more of professional in your inbox.


## Features

- Backend email-writer-sb using Spring Boot
- Frontend using React JS that connects to Backend
- A Chrome Extension that connects to Backend



## Deployment

To deploy this project run

- Run the Backend email-writer-sb 
```bash
  Import the email-writer-sb into your STS
  Run the project
```

- Install dependencies and Run the Frontend email-writer-react 
```bash
  npm install
  npm run dev
```

- To make use of the chrome extension go to `chrome://extensions/` and turn on `Developer mode` on the top right. Click `Load unpacked` from top left and select the email-writer-ext folder which contains the reuired code for the extension(make sure the Backend is running on port `8080`)
## Environment Variables

To run this project, you will need to add the following environment variables 

`GEMINI_URL`

`GEMINI_API`


## API Reference

#### Get all items

```http
  POST /api/email/generate
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `emailContent & tone` | `JSON` | Original mail, tone for replying |

Takes emailContent, tone and gives response as reply in String


## Tech Stack

**Client:** React, TailwindCSS

**Server:** Java, Spring Boot

**AI Tool:** Google Gemini AI

<div align = "center">
<h2>📬 Contact</h2>

If you want to contact me, you can reach me through below handles.

<a href="https://www.linkedin.com/in/syead-asraf/"><img src="https://www.felberpr.com/wp-content/uploads/linkedin-logo.png" width="25"> Syead Asraf </img></a>

</div>
