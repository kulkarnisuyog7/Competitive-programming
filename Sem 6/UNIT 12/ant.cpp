#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    int grid[5][5] = {
        {1, 4, 5, 16, 17},
        {2, 3, 6, 15, 18},
        {9, 8, 7, 14, 19},
        {10, 11, 12, 13, 20},
        {25, 24, 23, 22, 21}};
    while (cin >> n && n != 0)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (n == grid[i][j])
                {
                    cout << j + 1 << " " << i + 1;
                }
            }
        }
        cout << "\n";
    }
}
