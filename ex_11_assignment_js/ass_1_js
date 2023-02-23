let players=[];
let playersIDs=[];
let tbody=document.querySelector(".tbody");
let addBtn=document.querySelector(".btn");
addBtn.addEventListener("click",()=>{

    let id=document.querySelector("#id");
    if(playersIDs.includes(id.value))
    {
        alert("ID already exists, ");
        return;
    }
    let name=document.querySelector("#name");
    let runs=document.querySelector("#runs");
    if(id.value=="" || name.value=="" || runs.value=="")
    {
        alert("All field are mandatory ")
        return ;
    }
   
    let player={
        id:id.value,
        name:name.value,
        runs:runs.value,
    }
    players.push(player)
    playersIDs.push(id.value);


    showPlayers(players)
   
});



document.querySelector(".remove").addEventListener("click",()=>{
    let checkboxes=document.querySelectorAll(".checkbox");
  
    Array.from(checkboxes).forEach((checkbox)=>{
       if(checkbox.checked)
         removeThisPlayer(checkbox.value);      
    
    })
   
    function removeThisPlayer(id)
    {
        for(let i=0;i<players.length;i++)
        {
            if(players[i].id==id)
                players.splice(i,1);
        }
    }

    
    showPlayers(players);
   
})


function showPlayers(players)
{
    tbody.innerHTML=" ";
    let requireBody=""
    for(let player of players)
    {
        requireBody+=`<tr>
        <th scope="row">${player.id}</th>
            <td>${player.name}</td>
            <td>${player.runs}</td>
            <td><input type="checkbox" value="${player.id}" class="checkbox" ></td>
        </tr>`
    }
    tbody.innerHTML=requireBody;
}