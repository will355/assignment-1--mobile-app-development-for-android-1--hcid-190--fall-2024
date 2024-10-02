# Fall 2024 Mobile App Development for Android I — Assignment 1

* **Read these instructions repeatedly until you understand, then begin your project. If something is not clear, ask.**

## ❖ Before You Begin ❖

1. Log in to GitHub.
2. Fork this repo(sitory). See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/). **Ensure you check the box that asks if you *only* want to copy the `DONT-WORK-HERE` branch**.
3. Launch your command line interface, or CLI.
4. Use `gh` to clone your repo: `gh repo clone USERNAME/REPO-NAME`, where `USERNAME` is *your* GitHub username, not mine, and `REPO-NAME` is the name of this repo.
5. Create a branch with your first name and last name, all lower case and separated by a dash (no spaces). For example, my branch would be called `roy-vanegas` and I’d create it as follows: `git checkout -b roy-vanegas`. For there to be an upstream branch, I’d then do, `git push --set-upstream origin roy-vanegas`.
6. Checkout our your new personalized branch.
7. Do all your work in your personalized branch.

---

## ❖ Assignment Description ❖

For this assignment, you’ll be writing two Kotlin programs. The first is a program that accepts input from the user in the form of an integer, then creates a diamond whose width (in columns) and height (in rows) are dictated by user input. For example, if the user enters 5, then the height of the diamond is 5 rows and the width of the diamond is 5 columns. See [http://vanegas.cs.hartford.edu/uploads/videos/diamond-program-in-java.mp4](http://vanegas.cs.hartford.edu/uploads/videos/diamond-program-in-java.mp4).

**Important Note**: Odd and even versions of the diamond are rendered differently. Review the aforementioned video carefully for an example.

Your second program must do the following:

1. Requests from the user a positive number representing the size of a matrix
2. Prints a matrix consisting of `0`s
3. Populates the matrix with values from `1–(input × input)`
4. Prints the matrix with the newly-populated values
5. Swaps the contents of the matrix on one side of the diagonal formed from top right to bottom left with the other side, highlighting the elements along the diagonal and leaving them untouched/unswapped
6. Prints the flipped matrix

As mentioned in item 5, the elements in the diagonal **must not be touched**, while the other elements in the matrix **must be swapped**. The numbers in every cell of the matrix is arbitrary; each cell could have contained a letter, string, image, or other object/primitive. Numbers are being used in this assignment because they produce a sequence that is easy to follow when working with the matrix. **A movie of how this assignment should behave in its resolved state is available [here](http://vanegas.cs.hartford.edu/uploads/videos/matrix-flip-along-diagonal--java.mp4).**

---

## ❖ Grading ❖

| Item                                                                        | Points  |
|-----------------------------------------------------------------------------|:-------:|
| Program 1 works according to instructions                                   | `25`    |
| Program 2 works according to instructions                                   | `25`    |
| All code is neat and professional                                           | `25`    |
| All variable naming is logical                                              | `25`    |

---

## ❖ Due ❖

Friday, 18 October 2024, at 5:00 PM.

---

## ❖ Submission ❖

You will need to issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may _only_ be submitted via GitHub. **No other form of submission will be accepted**.
