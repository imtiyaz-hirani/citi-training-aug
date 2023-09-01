function login(){
    let username =document.getElementById("username").value;
    let password = document.getElementById("password").value;
    switch(username){
         
        case 'admin':
            if(password == 'admin'){
                location.replace('file:///C:/Users/Admin/Documents/imarticus-citi-july/coding%20for%20begineers/web%20dev/mypage.html')
            }
             
        case 'manager':
            if(password == 'manager'){
                location.replace('file:///C:/Users/Admin/Documents/imarticus-citi-july/coding%20for%20begineers/web%20dev/mypage.html')
            }
             
        case 'employee12':
            if(password == 'employee12'){
                location.replace('file:///C:/Users/Admin/Documents/imarticus-citi-july/coding%20for%20begineers/web%20dev/mypage.html')
            }
        
            document.getElementById('error_msg').style.display='block'
    } 
}