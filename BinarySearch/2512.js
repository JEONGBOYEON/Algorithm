const filePath = process.platform === 'linux' ?
    '/dev/stdin' : 'input.txt';

// const binarySearch = (start, end, array, max) => {
//     let mid = 0;
//     while (start < end) {
//         mid = parseInt((start + end) / 2);
//         let midValue = array[mid] * 4;

//         if (midValue > max) end = mid - 1;
//         else if (midValue < max) start = mid + 1;
//     }

//     return mid;
// }

// const solution = () => {
//     const [n, input, max] = require('fs').readFileSync(filePath).toString().trim().split('\n');
//     const requestArray = input.split(' ').map(Number).sort((a, b) => a - b);

//     if (requestArray.reduce((a, b) => a + b) < max) return Math.max(...requestArray);
//     else {
//         const midMax = binarySearch(0, requestArray.length - 1, requestArray, max);
//         const sum = requestArray.slice(0, midMax).reduce((a, b) => a + b);

//         return parseInt((max - sum) / (requestArray.length - midMax));
//     }
// }

const binarySearch = (start, end, array, target) => {
    let mid = 0;
    let result = 0;

    while (start <= end) {
        let total = 0;
        mid = Math.floor((start + end) / 2);

        for (let v of array) {
            total += Math.min(mid, v);
        }

        // start mid(total) target end
        // start target mid(total) end
        if (target >= total) {
            result = mid;
            start = mid + 1
        } else end = mid - 1;
    }

    return result;
}

const solution = () => {
    const [n, input, max] = require('fs').readFileSync(filePath).toString().trim().split('\n');
    const requestArray = input.split(' ').map(Number).sort((a, b) => a - b);

    return requestArray.reduce((a, b) => a + b) <= max ? Math.max(...requestArray) : binarySearch(1, Math.max(...requestArray) * n, requestArray, max);
}

console.log(solution());