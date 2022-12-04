let a = 10, b = 20, c, d, e, f;
        let choice;
        choice = '+';
        c = a + b;
        d = a - b;
        e = a * b;

        switch (choice)
        {

        case '+':
                console.log("the solution is: "+ c);
                break;
        case '-':
                console.log("the solution is: "+ d);
                break;
        case '*':
                console.log("the solution is: "+ e);
                break;
        case '/':
                if (b != 0)
                {
                    f = a / b;
                console.log("The solution is: "+ f);
                }
                else
                {
                        console.log("the number cannot be divided");
                }
                break;

        default:
                console.log("\nthe operator is not found");
        }