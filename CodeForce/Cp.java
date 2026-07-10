package CodeForce;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Cp {

/*
========================================================================
   JAVA COMPETITIVE PROGRAMMING TEMPLATE + HINGLISH EXPLANATION
   (Div 3 -> Div 2 -> Div 1 / High Level tak sab cover kiya hai)
========================================================================

   Isme har cheez COMMENT ke saath likhi hai. Bas Ctrl+F karke
   jo concept chahiye wo dhundo. Neeche index diya hai:

   1. FAST INPUT (BufferedReader + StringTokenizer)   -> Div3 basic
   2. FAST OUTPUT (StringBuilder + PrintWriter)        -> Div3 basic
   3. Math utility functions (min,max,gcd,lcm,pow)     -> Div3
   4. Arrays & Sorting (custom comparator)             -> Div3/Div2
   5. Prefix Sum / Difference Array                    -> Div3/Div2
   6. Binary Search (manual + built-in)                -> Div2
   7. Sieve of Eratosthenes (primes)                   -> Div2
   8. Modular Arithmetic (mod inverse, power)           -> Div2/Div1
   9. HashMap / TreeMap / PriorityQueue usage           -> Div2
  10. Pair class (custom object)                        -> Div2
  11. Graph representation + BFS + DFS                  -> Div2/Div1
  12. DSU (Disjoint Set Union / Union-Find)              -> Div1
  13. Segment Tree (range sum + point update)            -> Div1
  14. Exception handling (try/throw/throws)              -> general
  15. BigInteger (jab long bhi chhota pad jaye)           -> Div1

========================================================================
*/


    // ==================================================================
    // 1. FAST INPUT
    // ==================================================================
    /*
       BufferedReader   -> System.in se DATA fast padhta hai (buffer/chunk
                            me padhta hai, isliye Scanner se kaafi fast).
       InputStreamReader -> System.in raw BYTES deta hai, ye unhe CHARACTERS
                            me convert karta hai. BufferedReader ko yehi
                            "character stream" chahiye hota hai kaam karne ke liye.
       StringTokenizer   -> Ek line ko space se todkar tokens (words/numbers)
                            banata hai. split(" ") se FASTER hota hai, isliye
                            CP me isko prefer karte hain.

       "throws IOException" kyun likha?
       -> readLine() ek IOException throw kar sakta hai (agar read karte
          waqt kuch gadbad ho jaye). Java rule hai: agar koi checked
          exception aa sakta hai to ya to method ko "throws" likh do,
          ya try-catch me pakdo. CP me hum simply "throws IOException"
          likh dete hain taaki try-catch ka jhanjhat na ho.
    */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // Ek line se next integer token nikalne ka helper function
    static int nextInt() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }

    static long nextLong() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Long.parseLong(st.nextToken());
    }

    static String nextString() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    // ==================================================================
    // 2. FAST OUTPUT
    // ==================================================================
    /*
       System.out.println() BAAR BAAR call karna SLOW hota hai kyunki
       har call ek "flush" karti hai. Isliye CP me hum saara output
       StringBuilder me jama karke, END me EKHI BAAR print karte hain.
       PrintWriter bhi fast output ke liye use hota hai (BufferedWriter
       ke saath wrap karke).
    */
    static StringBuilder sb = new StringBuilder();
    // Use: sb.append(answer).append("\n");
    // Last me: System.out.print(sb);

    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    // Use: out.println(answer);
    // Last me: out.flush();  (warna output print hi nahi hoga!)


    // ==================================================================
    // 3. MATH UTILITY FUNCTIONS
    // ==================================================================
    /*
       Math.min(a, b)  -> chhota number deta hai
       Math.max(a, b)  -> bada number deta hai
       Math.abs(a)     -> absolute value (negative ko positive banata hai)
       Math.pow(a,b)   -> a^b (DOUBLE return karta hai, int ke liye
                          apna fast power function banao, neeche diya hai)
       Math.sqrt(a)    -> square root
       Math.ceil / Math.floor -> round up / round down (double return karta hai)
    */

    // GCD (Greatest Common Divisor) - Euclid algorithm
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // LCM (Least Common Multiple)
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b; // pehle divide karo, overflow bachane ke liye
    }

    // Fast power (a^b) in O(log b) time - "Binary Exponentiation"
    static long power(long a, long b) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) result *= a;  // agar b ka last bit 1 hai
            a *= a;
            b >>= 1; // b ko 2 se divide (right shift)
        }
        return result;
    }


    // ==================================================================
    // 4. ARRAYS & SORTING (custom comparator)
    // ==================================================================
    /*
       Arrays.sort(arr)          -> primitive array (int[], long[]) ko
                                     sort karta hai, DEFAULT ascending order
       Arrays.sort(arr, l, r)    -> sirf [l, r) range sort karta hai

       IMPORTANT: primitive int[] array ko custom comparator (jaise
       descending order) se sort NAHI kar sakte directly. Uske liye
       Integer[] (Wrapper class) use karna padta hai:
    */
    static void sortExample() {
        Integer[] arr = {5, 2, 9, 1, 7};
        // Descending order me sort karna:
        Arrays.sort(arr, (a, b) -> b - a); // lambda comparator
        // Ya phir: Arrays.sort(arr, Collections.reverseOrder());
    }


    // ==================================================================
    // 5. PREFIX SUM / DIFFERENCE ARRAY
    // ==================================================================
    /*
       Prefix Sum: range [l, r] ka sum O(1) me nikalne ke liye pehle
       se ek array bana lete hain jisme prefix[i] = arr[0]+arr[1]+...+arr[i]

       Query: sum(l, r) = prefix[r] - prefix[l-1]
    */
    static long[] buildPrefixSum(int[] arr) {
        long[] prefix = new long[arr.length + 1]; // 1-indexed rakha
        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        return prefix;
    }
    // Query karne ke liye: prefix[r+1] - prefix[l]   (0-indexed l,r ke liye)


    // ==================================================================
    // 6. BINARY SEARCH
    // ==================================================================
    /*
       SORTED array me O(log n) me element dhundhne ke liye use hota hai.
       CP me isko "answer par binary search" karne ke liye bhi use karte
       hain (jab directly search nahi karna, balki koi threshold value
       dhundhni ho jo ek condition satisfy kare).
    */
    static int binarySearch(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // (lo+hi)/2 se better - overflow nahi hoga
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1; // nahi mila
    }
    // Built-in: Arrays.binarySearch(arr, target) - ye bhi use kar sakte ho


    // ==================================================================
    // 7. SIEVE OF ERATOSTHENES (Prime numbers fast nikalna)
    // ==================================================================
    /*
       Agar 1 se N tak SAARE prime numbers chahiye ho, to ek-ek karke
       check karna SLOW hai (O(n*sqrt(n))). Sieve algorithm se
       O(n log log n) me sabhi primes nikal sakte ho.
    */
    static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; (long) i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // i ke saare multiples ko "not prime" mark karo
                }
            }
        }
        return isPrime;
    }


    // ==================================================================
    // 8. MODULAR ARITHMETIC (Div1/Div2 me bahut common)
    // ==================================================================
    /*
       Jab answer bahut BADA ho sakta hai, to usually question kehta hai
       "answer ko 10^9+7 se mod karke do". Rules yaad rakho:

       (a + b) % MOD
       (a - b + MOD) % MOD     <- negative se bachne ke liye +MOD zaroor karo
       (a * b) % MOD
       Division ke liye SEEDHA (a/b)%MOD nahi kar sakte!
       Uske liye "Modular Inverse" chahiye (Fermat's Little Theorem se,
       jab MOD prime ho): a / b (mod p) = a * power(b, p-2, p) (mod p)
    */
    static final long MOD = 1_000_000_007L;

    static long modPower(long a, long b, long mod) {
        a %= mod;
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) result = (result * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return result;
    }

    static long modInverse(long a, long mod) {
        return modPower(a, mod - 2, mod); // sirf tab kaam karega jab mod PRIME ho
    }


    // ==================================================================
    // 9. HashMap / TreeMap / PriorityQueue
    // ==================================================================
    /*
       HashMap<K,V>     -> O(1) average lookup, koi order guarantee nahi
       TreeMap<K,V>     -> SORTED order me rehta hai (Red-Black tree),
                            O(log n) operations, floorKey/ceilingKey jaise
                            useful methods milte hain
       PriorityQueue<T> -> "Heap" hai - default MIN-heap (sabse chhota
                            element top pe). MAX-heap banane ke liye
                            comparator do: new PriorityQueue<>(Collections.reverseOrder())
    */
    static void mapExample() {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] arr = {1, 2, 2, 3, 3, 3};
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1); // frequency count karna
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }


    // ==================================================================
    // 10. PAIR CLASS (Java me built-in Pair nahi hota, khud banao)
    // ==================================================================
    static class Pair implements Comparable<Pair> {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
        @Override
        public int compareTo(Pair other) {
            return this.first - other.first; // "first" ke basis pe sort hoga
        }
    }


    // ==================================================================
    // 11. GRAPH - Adjacency List + BFS + DFS
    // ==================================================================
    /*
       Graph ko represent karne ka sabse common tareeka:
       List<List<Integer>> adj = adjacency list

       BFS -> Queue use karta hai, LEVEL BY LEVEL traverse karta hai
              (shortest path unweighted graph me nikalne ke liye best)
       DFS -> Recursion/Stack use karta hai, ek path pe JITNA DEEP ja
              sakta hai jaata hai
    */
    static List<List<Integer>> buildGraph(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]); // undirected graph (dono taraf edge)
        }
        return adj;
    }

    static void bfs(List<List<Integer>> adj, int start, int n) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            // yaha "node" ko process karo
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    static void dfs(List<List<Integer>> adj, int node, boolean[] visited) {
        visited[node] = true;
        // yaha "node" ko process karo
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(adj, neighbor, visited);
            }
        }
    }


    // ==================================================================
    // 12. DSU (Disjoint Set Union) / Union-Find - Div1 level
    // ==================================================================
    /*
       Ye data structure batata hai ki do elements EK HI GROUP me hain
       ya nahi, aur GROUPS ko MERGE karta hai fast. Bahut use hota hai
       "connected components", "Kruskal's MST" jaise problems me.

       "Path Compression" + "Union by Rank" lagane se ye almost O(1)
       ho jaata hai per operation.
    */
    static class DSU {
        int[] parent, rank;
        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i; // shuru me har koi apna khud ka parent
        }
        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // PATH COMPRESSION (isse tree flat ho jaata hai)
            }
            return parent[x];
        }
        void union(int x, int y) {
            int rootX = find(x), rootY = find(y);
            if (rootX == rootY) return; // pehle se ek hi group me hain
            // UNION BY RANK: chhote tree ko bade ke niche lagao
            if (rank[rootX] < rank[rootY]) parent[rootX] = rootY;
            else if (rank[rootX] > rank[rootY]) parent[rootY] = rootX;
            else { parent[rootY] = rootX; rank[rootX]++; }
        }
    }


    // ==================================================================
    // 13. SEGMENT TREE (range sum query + point update) - Div1 level
    // ==================================================================
    /*
       Jab BAAR BAAR "range [l,r] ka sum/min/max do" aur "index i ka
       value update karo" dono chahiye ho O(log n) me, to Segment Tree
       use karte hain. Simple prefix sum me UPDATE slow hota (O(n)),
       Segment Tree me sab kuch O(log n) me hota hai.
    */
    static class SegmentTree {
        int[] tree, arr;
        int n;
        SegmentTree(int[] input) {
            n = input.length;
            arr = input;
            tree = new int[4 * n]; // 4*n size generally safe hota hai
            build(1, 0, n - 1);
        }
        void build(int node, int start, int end) {
            if (start == end) {
                tree[node] = arr[start];
                return;
            }
            int mid = (start + end) / 2;
            build(2 * node, start, mid);
            build(2 * node + 1, mid + 1, end);
            tree[node] = tree[2 * node] + tree[2 * node + 1]; // sum-tree
        }
        void update(int node, int start, int end, int idx, int val) {
            if (start == end) {
                arr[idx] = val;
                tree[node] = val;
                return;
            }
            int mid = (start + end) / 2;
            if (idx <= mid) update(2 * node, start, mid, idx, val);
            else update(2 * node + 1, mid + 1, end, idx, val);
            tree[node] = tree[2 * node] + tree[2 * node + 1];
        }
        int query(int node, int start, int end, int l, int r) {
            if (r < start || end < l) return 0; // range se BAHAR - no overlap
            if (l <= start && end <= r) return tree[node]; // range ke ANDAR - full overlap
            int mid = (start + end) / 2;
            // PARTIAL overlap - dono side check karo
            return query(2 * node, start, mid, l, r) + query(2 * node + 1, mid + 1, end, l, r);
        }
    }


    // ==================================================================
    // 14. EXCEPTION HANDLING (throw / throws / try-catch)
    // ==================================================================
    /*
       throw   -> khud se ek exception object create karke "fenkna"
       throws  -> method signature me batana ki ye exception de sakta hai
       try     -> risky code jo exception de sakta hai
       catch   -> agar exception aaya to yaha handle karo
       finally -> chahe exception aaye ya na aaye, ye HAMESHA chalega
    */
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero nahi kar sakte!");
        }
        return a / b;
    }

    static void exceptionExample() {
        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error pakda gaya: " + e.getMessage());
        } finally {
            System.out.println("Ye hamesha chalega, chahe error aaye ya na aaye");
        }
    }


    // ==================================================================
    // 15. BigInteger (jab long (64-bit) bhi overflow ho jaaye)
    // ==================================================================
    /*
       long ki max value ~ 9.2 * 10^18 hai. Agar factorial ya bahut
       bada multiplication karna ho jo isse bhi bada number de, to
       BigInteger use karo. Ye SLOW hota hai but koi overflow nahi hota.
    */
    static void bigIntegerExample() {
        BigInteger a = BigInteger.valueOf(123456789);
        BigInteger b = new BigInteger("987654321000000000000");
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        // Compare karne ke liye: a.compareTo(b)
    }


    // ==================================================================
    // MAIN METHOD - sample use dikhane ke liye
    // ==================================================================
    public static void main(String[] args) throws IOException {
        // Example: t test cases lo, har case me 2 numbers lo, unka
        // GCD, LCM aur MIN print karo (fast IO ke saath)

        int t = nextInt(); // total test cases
        while (t-- > 0) {
            long a = nextLong();
            long b = nextLong();

            sb.append("min=").append(Math.min(a, b))
              .append(" gcd=").append(gcd(a, b))
              .append(" lcm=").append(lcm(a, b))
              .append("\n");
        }

        System.out.print(sb); // EK BAAR me pura output print karo (fast)
    }
}
    

