#include <iostream>
#include <cstdio>
#include <vector>
#include <queue>
#define MAXN 202
using namespace std;
typedef vector<int> vi;

vector<vector<int>> graph;
vector<bool> discovered; // keeps track if a node has been reached
vector<int> parent;      // stores the nodes ancestor that discovered it for the first time
vector<int> distances;   // stores the distance to reach each node from the source
bool isBipartite;

void read_graph(int edges)
{
    int vertex1, vertex2;
    int i;
    for (i = 0; i < edges; i++)
    {
        scanf("%d %d", &vertex1, &vertex2);
        graph[vertex1].push_back(vertex2);
        graph[vertex2].push_back(vertex1);
    }
}

void bfs(int start)
{
    int current; // current node being processed
    int next;    // reached node by current
    unsigned int i;
    queue<int> vertices; // vertices to process
    distances[start] = 0;
    discovered[start] = true;
    vertices.push(start);
    isBipartite = true;

    while (!vertices.empty() && isBipartite)
    {
        current = vertices.front();
        vertices.pop();
        for (i = 0; i < graph[current].size(); i++) // for each node connected to current
        {
            next = graph[current][i];
            if (!discovered[next]) // if it hasn't been reached
            {
                discovered[next] = true;                  // mark it as reached
                parent[next] = current;                   // store its parent
                distances[next] = 1 - distances[current]; // save the distance
                vertices.push(next);                      // push it to the queue for further analysis
            }
            else if (distances[next] == distances[current])
            {
                isBipartite = false;
                break;
            }
        }
    }
}

void find_path(int vertex) // recursive procedure to find the path
{
    if (vertex == -1)
        return;
    find_path(parent[vertex]);
    printf("%d ", vertex);
}

int main()
{
    int vertices, edges;
    while (scanf("%d", &vertices))
    {
        if (!vertices)
            break;
        scanf("%d", &edges);
        graph.assign(vertices, vi());
        discovered.assign(vertices, false);
        distances.assign(vertices, -1);
        parent.assign(vertices, -1);
        read_graph(edges);
        bfs(0);
        if (isBipartite)
            printf("BICOLORABLE.\n");
        else
            printf("NOT BICOLORABLE.\n");
    }
    return 0;
}
