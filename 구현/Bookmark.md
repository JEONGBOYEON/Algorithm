
###BufferedReader

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//String > int
int num = Integer.parseInt(bf.readLine());
//String > char 배열
char input[] = (bf.readLine()).toCharArray();
```

---

### Scanner

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int num = sc.nextInt()
String str = sc.nextline();
```

---

### Integer

```java
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
```

---

### StringTokenizer

```java
import java.util.StringTokenizer;

StringTokenizer st = new StringTokenizer(br.readLine()," ");
while(num-- > 0){
    int temp = Integer.parseInt(st.nextToken());
    max = temp > max ? min : max;
    min = temp < min ? temp : min;
}
```

---

### Queue

```java
import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> queue = new LinkedList<>();
//추가
queue.add(1); 
queue.offer(2);
//삭제
queue.poll();   // queue에 첫번째 값을 반환하고 제거 비어있다면 null
queue.remove(); // queue에 첫번째 값 제거
queue.clear();
//참조
queue.peek();
}
```