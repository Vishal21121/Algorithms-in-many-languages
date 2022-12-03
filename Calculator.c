#include <stdio.h>
void main()
{
        int a, b, c, d, e, f;
        int g;
        char choice;

        printf("enter the first number:");
        scanf("%d", &a);
        printf("choose the operation:\n");
        printf("1.addition\n2.substraction\n3.multiplication\n4.division\n");
        scanf("%s", &choice);
        printf("enter the second number:");
        scanf("%d", &b);

        c = a + b;
        d = a - b;
        e = a * b;

        switch (choice)
        {

        case '+':
                printf("the solution is: %d", c);
                break;
        case '-':
                printf("the solution is: %d", d);
                break;
        case '*':
                printf("the solution is: %d", e);
                break;
        case '/':
                if (b != 0)
                {
                    f = a / b;
                printf("The solution is: %d ", f);
                }
                else
                {
                        printf("the number cannot be divided");
                }
                break;

        default:
                printf("\nthe operator is not found");
        }
}
