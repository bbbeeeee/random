function merge_sort(input){
	var len = input.length;                    // get Length
	console.log(input);
	if(len == 1) return input;

	var a = input.slice(0, Math.floor(len/2)); // split array in 2 (a, b)
	var b = input.slice(Math.floor(len/2));

	a = merge_sort(a);                         // recursive calls for each a and b
	b = merge_sort(b);

	return merge(a, b);                        // return merged a and b to next level
}

function merge(a, b){
	var c = [];                                // c is going to be the resulting array for each iteration

	while(a.length > 0 && b.length > 0){			 // if both have elements still,
		if(a[0] > b[0]){                         // if a's first element greater than b's
			c[c.length] = b[0]                     // set b[0] to c's last element
			b.splice(0, 1);                        // take b's element off
		} else {
			c[c.length] = a[0]                     // do opposite if b[0] > a[0] 
			a.splice(0, 1);
		}
	}
	while(a.length > 0){                       // if just a has length,
		c[c.length] = a[0]                       // pop in like before
		a.splice(0, 1);
	}
	while(b.length > 0){                       // if just b has length
		c[c.length] = b[0]                       // pop in like before
		b.splice(0, 1);
	}
	return c;                                  // send the final array up
}