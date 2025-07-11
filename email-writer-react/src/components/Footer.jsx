import { MdOutlineEmail } from "react-icons/md";
import { CiLinkedin } from "react-icons/ci";
import { FaGithub } from "react-icons/fa";


const Footer = () => {
  return (
    <>
      <div id="Footer">
        <div>
          <h1 >Contact</h1>
          <h3>Feel Free To reach out!</h3>
        </div>

        <ul>
          <li>
            <MdOutlineEmail size={20} />
            contact.syead@gmail.com
          </li>
          <li>
            <CiLinkedin />
            <a href="https://www.linkedin.com/in/syead-asraf/" target="_blank">Linkdin.com/Syead-Asraf</a>
          </li>
          <li>
            <FaGithub />
            <a href="https://github.com/m-syead-asraf" target="_blank">Github.com/M-Syead-Asraf</a>
          </li>
        </ul>

      </div>
    </>
  );
};

export default Footer;
