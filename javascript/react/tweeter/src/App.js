import React, { useState } from 'react';
import './App.css';
import {AiOutlineTwitter, AiTwotoneStar, AiOutlinePicture, AiOutlineSmile, AiOutlineAlignLeft, AiOutlineFileGif, AiOutlineDown} from 'react-icons/ai'
import {BiHomeCircle} from 'react-icons/bi'
import {BiHash} from 'react-icons/bi'
import {BiBell} from 'react-icons/bi'
import {MdBookmarkBorder, MdMailOutline} from 'react-icons/md'
import {FaUserCircle, FaEllipsisH} from 'react-icons/fa'
import {BsCardText} from 'react-icons/bs'

const sendTweet = [
  {
    id: 1,
    text: "It's a beautiful day to play outside!",
    pfp: "/images/profile.jpg",
    photo: "/images/post.jpg",
    username: "Bucky Boy",
    usertag: "@BucktownFunk",
  }
]
console.log("sendTweet", sendTweet)

function App() {

  console.log("I am inside the funciton")

  const [newTweets, setNewTweets] = useState(sendTweet)
  console.log("newTweets", newTweets)

  const handleNewTweet = (e) => {
    console.log("I'm typing.....", e.target.value)

    const addingTweets = {
      id: newTweets.at(-1).id +1,
      text: e.target.value,
    }
    console.log("addingTweets", addingTweets)
  }






  return (
    <div className="App">
      <div className="Main">

        <div className="Sidebar-Area">
          <div className="Twitter">
            <AiOutlineTwitter color="#1DA1F2" fontSize="2.3rem"/>
          </div>
          <div className="Icons">
            <BiHomeCircle color="#1DA1F2" fontSize="2rem"/>
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
              <input type="Post" placeholder="Sup Dawgs" onChange={handleNewTweet}/> {/*WHERE WE ADD TEXT, ONCHANGE*/}
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
              <button className="button" onClick={() => { setNewTweets([]) }}> {/*ONCLICK HERE*/}
                Tweet
              </button>
            </div>
          </div>
        </div>
      {sendTweet.map((item) =>
        <div className="posted-feed" id={item.id} key={item.id}>
          <div className="User-posts">
            <div className="User-content">
              <img src={item.pfp} alt="pfp" style={{height: "30px", width: "30px", borderRadius: "50%"}}/>
              <div className="Username">{item.username}</div>
              <div className="User-at">{item.usertag}</div>
            </div>
          </div>
          <div className="Tweet-text">
          {item.text}
          </div>
          <br></br>
          <div className="Post-image">
            <img src={item.photo} alt="post" style={{width: "100%", height: "42rem", objectFit: "fill"}}/>
          </div>
        </div>
      )}
      </div>

      <div className="Left-Sidebar-Area">
        Left Sidebar Area
      </div>

    </div>

  </div>
    
  );
} 

export default App;




Emre's Twitter

// - Show (3) pre-existing tweets (from different users)
//   - Show user icon
//   - Show user name
//   - Show user tag
//   - Show tweet
//   - Show likes
// - Tweet
//   - Add char limit (200)
//   - Show the new tweet on the bottom of the tweets
//   - New tweet should show all 'standard' information
//     - user icon, user name, user tag, tweet
// - Retweet
//   - Show the retweeted tweet on the bottom of the page
//   - Show the "origin" tweeter user
//   - Show the "new" tweeter user information (Retweeted by Emre)
// - Like tweets
//   - Like count should go up
//   - Disliking a tweet should lower count 
// - Give the user a proper validation message
//   - if they try putting in a tweet of over 200 chars, let them know that's not allowed
//   - dont allow user to input an empty tweet
//   - allow but REMOVE empty spaces around a tweet
//     - ex: `          this is a tweet.        `
//     - should be come `this is a tweet.`

// Stretch goal:

// - Delete tweets
// - Edit tweets
// - Allow comments
//   - comments would show under the specific tweet
//   - comments should be 'editable'
//   - comments should be deletable
// - Only allow ALL OF THE ABOVE for the tweet's owner (aka you can only add/edit/delete your own tweets)
// - Tweet a picture
//   - all features mentioned above should also work here