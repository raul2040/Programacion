def oddOrEven(arr):
    arr = sum(arr)
    resultado = arr
    if resultado%2 == 0:
        return("even")
    else:
        return("odd")
    
        



if __name__ == "__main__":
    testCase = [0]
    assert oddOrEven(testCase) == "even", "hemos fallado en el primer caso test"
    testCase = [2,5,34,6]
    assert oddOrEven(testCase) == "odd", "hemos fallado el segundo caso test"
    testCase = [0, -1, -5]
    assert oddOrEven(testCase) == "even", "hemos fallado el tercer caso test"
    testCase = [0, 1, 2]
    assert oddOrEven(testCase) == "odd", "hemos fallado el cuarto caso test"

print (oddOrEven(testCase))