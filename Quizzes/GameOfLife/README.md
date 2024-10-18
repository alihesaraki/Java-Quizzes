# Game of Life

The Game of Life, created by John Conway, is a simple yet fascinating simulation that produces complex behaviors. This game is played on a two-dimensional grid where each cell can have two states: alive (1) or dead (0). The state of each cell is updated based on its neighbors. Two cells are considered neighbors if they share a point or an edge.

## Rules of the Game
1. Any live cell with fewer than two live neighbors dies (underpopulation).
2. Any live cell with two or three live neighbors lives on to the next generation (survival).
3. Any live cell with more than three live neighbors dies (overpopulation).
4. Any dead cell with exactly three live neighbors becomes a live cell (reproduction).
5. All other dead cells remain dead.

Write a program that takes an `n × n` grid, where each cell is either 0 (dead) or 1 (alive). The program should update the state of the cells based on the rules of the Game of Life and print the resulting grid.

### Input
- The first line of input contains an integer `n`, the size of the grid.
    - \( 1 \leq n \leq 100 \)

- The next `n` lines contain the `n × n` grid consisting of 0s and 1s that specify the initial state of the game.

### Output
- Print the resulting `n × n` grid in the same format as the input, indicating the new state of the grid after one iteration of the game.
