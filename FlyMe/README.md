## Step-by-Step Algorithm

Step 1: 
- We start at the first airport (index 0).
- We need to reach the last airport (index N-1) using the minimum number of planes.
- If reaching the last airport is not possible, return -1.

Step 2: Define Key Variables
- jumps → To count the number of planes hired.
- currentEnd → The farthest airport we can reach using the current plane.
-farthest → The farthest airport we can reach at any point while iterating.

Step 3: Iterate Through the Array
- We traverse the fuel[] array to determine the minimum jumps required to reach the last airport.
- Start iterating from i = 0 to N-2 (excluding the last airport because we don’t need to jump beyond it).
- Keep track of the farthest airport that can be reached:
farthest = max(farthest, i + fuel[i])
- This tells us how far we can go from airport i.
- If we reach currentEnd, we must hire a new plane (jumps++)

Update currentEnd = farthest (new range of travel).
If currentEnd >= N-1, return jumps (we reached the last airport).
If we get stuck (i.e., fuel[i] == 0 and i == farthest), return -1

This means we cannot move further and are stranded.

Step 4: Return the Answer
- If we reach the last airport, return jumps.
- If we complete the loop and haven’t reached N-1, return -1 (destination unreachable).