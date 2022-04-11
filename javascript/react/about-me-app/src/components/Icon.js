import React from 'react';
import Logo from './Logo.js';

const Icon = (props) => {
    <div>
        {props.icon.map(icon => <p key={icon}>{icon}</p>)}
        <Logo/>
    </div>
};

export default Icon;