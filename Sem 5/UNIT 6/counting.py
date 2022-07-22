sol_space = {}
def foo(n):
    if n < 1:
        return 1
    if n in sol_space:
        return sol_space[n]
   
    sol = 0
    if n >= 1:
        sol += 2 * foo(n - 1)
    if n >= 2:
        sol += foo(n - 2)
    if n >= 3:
        sol += foo(n - 3)
    sol_space[n] = sol
    return sol
   
number = int(input())
print(foo(number))
