let myOrders;
let myFilteredOrders = new Array();

function setMyOrders(orders){
    myOrders = orders;
}

function onSearchButton(){
    myFilteredOrders = []
    filterByOrderStatus(myOrders);
    setTableBody();
}

function filterByOrderStatus(myOrders){

    let orderStatus = document.getElementById("status-id");

    myOrders.forEach(order => {
        if (order.orderStatus == orderStatus.value)
        {
            myFilteredOrders.push(order);
        }

    });

    console.log(myFilteredOrders);
}

function setTableBody(){

    var table = document.getElementById("orders-table-body");

    myFilteredOrders.forEach(order => {
        // Create a row
        var rowNode = document.createElement("tr");

        // Create an ID column
        var cellNode = document.createElement("td");
        // Create a node containing the ID value
        var textNode = document.createTextNode(order.orderId);

        cellNode.appendChild(textNode);
        rowNode.appendChild(cellNode);
        table.appendChild(rowNode);

    });
}