import React from 'react';

const MyLikes = (props) => (
  <div className="likes-dislikes">
    <h3>Likes:</h3>
    {props.likes.map(likes => <li key={likes}>{likes}</li>)}
  </div>
);

export default MyLikes;