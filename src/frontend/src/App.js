import {  
        Button, 
        Radio,
        RadioGroup,
        FormControl,
        FormControlLabel,
        FormLabel

  } 
from '@mui/material';
import React from 'react';
import './App.css';

function App() {
  return (
    <div className="App">
      <div className="Vutton"><br></br><br></br>
        <Button id='Primary' type='primary' size= "large" variant="contained">
          Hello
        </Button>
        <div>
          <FormControl>
            <FormLabel id="demo-row-radio-buttons-group-label" className='School'></FormLabel>
            <RadioGroup
              row
              aria-labelledby="demo-row-radio-buttons-group-label"
              name="row-radio-buttons-group"
            >
              <FormControlLabel value="Students" control={<Radio />} label="Students" className='Button1'/>
              <FormControlLabel value="Teachers" control={<Radio />} label="Teacher" className='Button2' />
              <FormControlLabel value="Staffs" control={<Radio />} label="Other" className='Button3' />
              </RadioGroup>
          </FormControl>
        </div>
      </div>
    </div>
  );
}

export default App;
