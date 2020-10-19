import React from 'react';

const Hello = () => {
    // return (
    //     <div className='dummyClass'>
    //         <h1>Hello Neeraj</h1>
    //     </div>
    // )

    //return React.createElement('div',null,'h1','Hello Neeraj');
    return React.createElement('div',
        {id:'hello',className:'dummyClass'},
        React.createElement('h1', null, 'Hello Neeraj'));
}

export default Hello