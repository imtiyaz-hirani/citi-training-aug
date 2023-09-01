function showAddress(){
   // alert('in function'); -- testing
   document.getElementById('address')
            .style.display='block'
}


function showMfInfo(){
    // alert('in show mf info'); -- testing
    let mf_flexi = document.getElementById('mf_flexi').checked;
    let mf_large = document.getElementById('mf_large').checked;
    let mf_small = document.getElementById('mf_small').checked;
    
    if(mf_flexi == true){
        document.getElementById('info_flexi')
            .style.display='block'

        document.getElementById('info_large')
            .style.display='none'
        
        document.getElementById('info_small')
            .style.display='none'
    }
    else
    if(mf_large == true){
        document.getElementById('info_flexi')
            .style.display='none'

        document.getElementById('info_large')
            .style.display='block'
        
        document.getElementById('info_small')
            .style.display='none'
    }
    else
    if(mf_small == true){
        document.getElementById('info_flexi')
            .style.display='none'

        document.getElementById('info_large')
            .style.display='none'
        
        document.getElementById('info_small')
            .style.display='block'
    }
}

/** 
 if Flexi Cap is clicked, 
 mf = FLEXI

 if large Cap is clicked, 
 mf = LARGE

 if large Cap is clicked, 
 mf = SMALL
 */