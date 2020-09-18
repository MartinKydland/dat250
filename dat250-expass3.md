# Report - software technology experiment
## Technical problems during installation of MongoDB:
* I couldn't verify the installation package with a sha-256 checksum. Turns out i had to use powershell instead of command prompt, and it worked.

### Validation of MongoDB:
![Validation of MongoDB](expass-3-assets/verification.png)

## CRUD operations:
### Create:
![Create operation](expass-3-assets/create.png)

### Read:
![Read operation](expass-3-assets/read.png)

### Update:
![Update operation](expass-3-assets/update.png)

### Delete:
![Delete operation](expass-3-assets/delete.png)

## Experiment 2 example:
![Map-reduce example](expass-3-assets/mapreduceexample.png)

## My own map-reduce function:
```javascript
var mapFunction = function(){
	for (var idx = 0; idx < this.items.length; idx++) {
		var value = {sku: this.items[idx].sku, qty: this.items[idx].qty };
		emit(this.ord_date, value);
	}
};

var reduceFunction = function(ord_date, value){
    qtylist = [];
    for (var idx = 0; idx < value.length; idx++){
        if (qtylist.some(e => e.sku === value[idx].sku)){
            item = (qtylist.find(e => e.sku === value[idx].sku));
            item.qty += (value[idx].qty);
        } else {
            item = {sku: "", qty: 0};
            item.sku = value[idx].sku;
            item.qty = value[idx].qty;
            qtylist.push(item);
        }
    }

    reducedVal = qtylist[0];
    for (var idx = 1; idx < qtylist.length; idx++){
        if(reducedVal.qty < qtylist[idx].qty){
            reducedVal = qtylist[idx];
        } else if (reducedVal.qty == qtylist[idx].qty){
            reducedVal.sku = reducedVal.sku + ", " + qtylist[idx].sku;
        }
    }
    return reducedVal;    
};

db.orders.mapReduce(mapFunction, reduceFunction, {out: "map_reduce_example"});

```