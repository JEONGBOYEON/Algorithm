// https://www.acmicpc.net/problem/1707
// https://github.com/users/boyeonJ/projects/4/views/1?pane=issue&itemId=47512598

const filePath = process.platform === 'linux' ?
    '/dev/stdin' : 'input.txt';

const bfs = (queue, graph, nodeLength) => {
    const visited = new Array(nodeLength + 1).fill(-1);
    visited[queue[0]] = 0;

    while (queue.length) {
        const cur = queue.shift();

        for (let nei of graph[cur]) {
            if (visited[nei] === -1) {
                visited[nei] = visited[cur] === 0 ? 1 : 0;
                queue.push(nei);
            }
        }
    }
    return visited;
}

const isVaildation = (visited, graph) => {
    visited = visited.filter((v) => v !== -1);

    for (let cur = 1; cur < graph.length; cur++) {

        for(let nei of graph[cur]){
            if(nei===0) continue;
            if (visited[cur] === visited[nei]) return false;
        }
    }

    return true;
}

const solution = () => {
    let [k, ...inputs] = require('fs').readFileSync(filePath).toString().trim().split('\n');

    for (let i = 0; i < k; i++) {
        const [v, e] = inputs[0].split(' ').map(Number);
        const edges = inputs.slice(1, e + 1);
        inputs = inputs.slice(e + 1)

        let graph = Array.from({
            length: v + 1
        }, () => Array(1).fill(0));

        // 그래프 생성
        for (let edge of edges) {
            const [f, s] = edge.split(' ').map(Number);
            graph[f].push(s);
            graph[s].push(f);
        }

        let queue = [1];
        console.log(isVaildation(bfs(queue, graph, v), graph));
    }
}

solution();