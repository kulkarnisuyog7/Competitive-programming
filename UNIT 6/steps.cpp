

---------- Forwarded message ---------
From: Zain Khawja <7.zaink@gmail.com>
Date: Thu, Dec 30, 2021 at 10:56 AM
Subject: Steps- unit 6
To: Zain Khawja <7.zaink@gmail.com>


#include <iostream>
using namespace std;

int main(void) {
    int n, a, b;

    cin >> n;

    while (n--) {
        cin >> a >> b;

        int result, steps = 0, diff = b - a;

        while (true) {
            if (diff == 0) {
                result = 2 * steps;
                break;
            } else if (diff < 2 * (steps + 1)) {
                if (steps + 1 >= diff)
                    result = 2 *a steps + 1;
                else
                    result = 2 * steps + 2;

                break;
            }

            steps++;
            diff = b - a - steps * (1 + steps);
        }

        cout << result << endl;
    }

    return 0;
}
