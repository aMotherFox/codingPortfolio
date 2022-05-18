import React, { useState } from 'react';
import './App.css';
import {AiOutlineTwitter, AiTwotoneStar, AiOutlinePicture, AiOutlineSmile, AiOutlineAlignLeft, AiOutlineFileGif, AiOutlineDown} from 'react-icons/ai'
import {BiHomeCircle} from 'react-icons/bi'
import {BiHash} from 'react-icons/bi'
import {BiBell} from 'react-icons/bi'
import {MdBookmarkBorder, MdMailOutline} from 'react-icons/md'
import {FaUserCircle, FaEllipsisH} from 'react-icons/fa'
import {BsCardText} from 'react-icons/bs'

type Tweet =
  {
    id: number,
    text: string,
    pfp: string,
    photo: string,
    username: string,
    usertag: string,
  }

const sendTweet: Tweet = {
  id: 1,
  text: "It's a beautiful day to play outside!",
  pfp: "/images/profile.jpg",
  photo: "/images/post.jpg",
  username: "Bucky Boy",
  usertag: "@BucktownFunk",
}
console.log("sendTweet", sendTweet)
console.log("array of objects?", Array.isArray(sendTweet))


function App() {

  console.log("I am inside the funciton")
  









  return (
    <div className="App">
      <div className="Main">
        <div className="Sidebar-Area">
        <div className="Twitter">
            {/* <AiOutlineTwitter color="#1DA1F2" fontSize="2.3rem"/> */}
          </div>
          <div className="Icons">
            {/* <BiHomeCircle color="#1DA1F2" fontSize="2rem"/> */}
            <div>Home</div>
          </div>
          <div className="Icons">
            <BiHash color="#1DA1F2" fontSize="2rem"/>
            <div>Explore</div>
          </div>
          <div className="Icons">
            <BiBell color="#1DA1F2" fontSize="2rem"/>
            <div>Notifications</div>
          </div>
          <div className="Icons">
            <MdMailOutline color="#1DA1F2" fontSize="2rem"/>
            <div>Messages</div>
          </div>
          <div className="Icons">
            <MdBookmarkBorder color="#1DA1F2" fontSize="2rem"/>
            <div>Bookmarks</div>
          </div>
          <div className="Icons">
            <BsCardText color="#1DA1F2" fontSize="2rem"/>
            <div>Lists</div>
          </div>
          <div className="Icons">
            <FaUserCircle color="#1DA1F2" fontSize="2rem"/>
            <div>Profile</div>
          </div>
          <div className="Icons">
            <FaEllipsisH color="#1DA1F2" fontSize="2rem"/>
            <div>More</div>
          </div>
          <div className="Icons">
            <button className="button">
              Tweet
            </button>
          </div>
        </div>





        <div className="Main-Area">
          <div className="Home">
            <div className="home2">
              Home
            </div>
            <div className="Star-icon">
            <AiTwotoneStar color="#1DA1F2" fontSize="2rem"/>
            </div>
          </div>
          <br></br>
          <div className="Create-post">
            <div className="Add-text">
              <div className="Profile">
              <img src="/images/profile.jpg" alt="profile" style={{height: "35px", width: "35px", borderRadius: "50%"}}/>
              </div>
              <input type="Post" placeholder='Sup Dawgs'/>
            </div>
          
            <div className="Buttons">
              <div className="Icons">
                <div className="Buttons-icon">
                <AiOutlinePicture fontSize="1.5rem" color="1DA1F2"/>
                </div>
                <div className="Buttons-icon">
                  <AiOutlineFileGif fontSize="1.5rem" color="1DA1F2"/>
                </div>
                <div className="Buttons-icon">
                  <AiOutlineAlignLeft fontSize="1.5rem" color="1DA1F2"/>
                </div>
                <div className="Buttons-icon">
                  <AiOutlineSmile fontSize="1.5rem" color="1DA1F2"/>
                </div>
              </div>
              <div className="Tweets">
                <button className="button">
                  Tweet
                </button>
              </div>
            </div>
          </div>
          <div className="posted-feed">
          <div className="User-posts">
            <div className="User-content">
            <img src="images/profile.jpg" alt="pfp" style={{height: "30px", width: "30px", borderRadius: "50%"}}/>
            <div className="Username"></div>
            <div className="User-at"></div>
            </div>
          </div>
          <div className="Tweet-text">
            This is a tweet
          </div>
          <br></br>
          <div className="Post-image">
          <img src="images/post.jpg" alt="post" style={{width: "100%", height: "42rem", objectFit: "fill"}}/>
          </div>
        </div> 
        </div>





        <div className='Left-Sidebar-Area'>
          Left Sidebar
        </div>
      </div>

    </div>


  )
} 

export default App;
