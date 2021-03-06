import React, { useState } from 'react';
import './App.css';
import {AiOutlineTwitter, AiTwotoneStar, AiOutlinePicture, AiOutlineSmile, AiOutlineAlignLeft, AiOutlineFileGif, AiOutlineDown} from 'react-icons/ai'
import {BiHomeCircle} from 'react-icons/bi'
import {BiHash} from 'react-icons/bi'
import {BiBell} from 'react-icons/bi'
import {MdBookmarkBorder, MdMailOutline} from 'react-icons/md'
import {FaUserCircle, FaEllipsisH, FaRegHeart, FaRetweet, FaRegComment} from 'react-icons/fa'
import {BsCardText} from 'react-icons/bs'

type Tweet =
  {
    id: number,
    text: string,
    pfp: string,
    photo: string | undefined,
    username: string,
    usertag: string,
    likes: number,
  }

const initialTweets: Tweet[] = [
  {
  id: 1,
  text: "It's a beautiful day to play outside!",
  pfp: "/images/profile.jpg",
  photo: "/images/post.jpg",
  username: "Bucky Boy",
  usertag: "@BucktownFunk",
  likes: 350000,
  },
  {
    id: 2,
    text: "Did you guys know there's a way to open the garbage can??",
    pfp: "/images/hankProfile.jpg",
    photo: undefined, 
    username: "OG Furbabie",
    usertag: "@HankTheTank",
    likes: 211,
  },
  {
    id: 3,
    text: "Please sign my petition requiring human slaves to feed us 10x a day",
    pfp: "/images/rockyProfile.jpg",
    photo: undefined,
    username: "Sigma Grindset",
    usertag: "@EyeOfTheTiger",
    likes: 3,
  }
]
console.log("initialTweets", initialTweets)
console.log("array of objects?", Array.isArray(initialTweets))

type InputValues = {
  tweetText: {value: string},
  tweetUser: {value: string},
  tweetAt: {value: string},
} & EventTarget


function App() {

  const [ourTweets, setOurTweets] = useState<Tweet[]>(initialTweets)
  console.log("ourTweets", ourTweets)
  

  const handleSubmit = (e: React.ChangeEvent<any>) => {
    // console.log("I'm typing.....", e.target.value)
    console.log("I've been clicked")
    e.preventDefault();

    // const targetedField = e.target as InputValues
    // let tweetText = targetedField.tweetText.value;
    // // let tweetUser = targetedField.tweetUser.value;
    // // let tweetAt = targetedField.tweetAt.value;
    // const firstInArray = ourTweets[0]

    // setOurTweets(
    //   [
    //     {
    //       id: firstInArray.id + 1,
    //       text: tweetText,
    //       pfp: "/images/profile.jpg",
    //       photo: undefined,
    //       username: "Bucky Boy",
    //       usertag: "@BucktownFunk",
    //       likes: 0,
    //     },
    //     ...ourTweets
    //   ]
    // )
    // tweetText=""


    // const newTweets = {
    //   id: 4,
    //   text: e.target.value,
    //   pfp: "/images/profile.jpg",
    //   photo: undefined,
    //   username: "Bucky Boy",
    //   usertag: "@BucktownFunk",
    //   likes: 0,
    // }
    // console.log("newTweets", newTweets)

    // const spreadTweet = [
    //   ...ourTweets,
    //   newTweets
    // ]
    // console.log("spreadTweet", spreadTweet)

    // setOurTweets(spreadTweet)


    // setOurTweets(
    //   [
    //     {
    //       id: 4,
    //       text: e.target.value,
    //       pfp: "/images/profile.jpg",
    //       photo: undefined,
    //       username: "Bucky Boy",
    //       usertag: "@BucktownFunk",
    //       likes: 0,
    //     },
    //     ...ourTweets,
    //   ]
    // )
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
              <input type="Post" placeholder="Sup Dawgs"  onChange={handleSubmit}/> {/*WHERE WE ADD TEXT, ONCHANGE*/}
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
              <form onSubmit={(e) => handleSubmit(e)}>
                <button className="button"> {/*ONCLICK HERE*/}
                  Tweet
                </button>
              </form>
            </div>
          </div>
        </div>

        
          {initialTweets.map((item) =>
            <div className="posted-feed" key={item.id}>
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
                {item.photo && <img src={item.photo} alt="post" style={{width: "100%", height: "42rem", objectFit: "fill"}}/>}
              </div>
              <br></br>
              <div className="Comment-section">
                <div className="Comment">
                  <FaRegComment fontSize="1.4rem"/>
                </div>
                <div className="Comment">
                  <FaRetweet fontSize="1.4rem"/>
                </div>
                <div className="Comment">
                  <FaRegHeart fontSize="1.4rem"/>
                  <div className="Likes">
                  {item.likes}
                  </div>
                  <br></br>
                </div>
              </div>
            </div>
          )}
        

      </div>

      <div className="Left-Sidebar-Area">
        Left Sidebar Area
      </div>

    </div>

  </div>


  )
} 

export default App;


// && is; if the thing is true, show the thing, if not, then don't show