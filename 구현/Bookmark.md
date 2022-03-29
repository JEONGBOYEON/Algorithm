
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

### 

