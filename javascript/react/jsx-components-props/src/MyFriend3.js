import React from 'react'

const myFriend3 = (props) => {
    
    const friend = props.friend

    return (
        <div>
            <p>my friend's name: {friend.name}</p>
            <p>my friend's age: {friend.age}</p>
            <p>my friend's favorite color: {friend.favoriteColor}</p>
            <hr />
        </div>
    )

}

export default myFriend3