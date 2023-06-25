# CS-305-Portfolio-
CS 305 Software Security Portfolio Submission

Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?
Artemis Financial is a financial company that helps clients plan and create financial and insurance solutions. We have been tasked with creating secure storage for private and sensitive data and create secure solutions for communications.

What did you do very well when you found your client’s software security vulnerabilities? Why is it essential to code securely? What value does software security add to a company’s overall wellbeing?
I was unfamiliar with algorithm ciphers and used the SHA-256 cipher effectively.  Secure coding is essential to protect sensitive data and ensure that unauthorized and unauthenticated users are not accessing this information. Using the SHA-256 cipher, I was successfully able to encrypt the data to improve secure communications and reduce the security risk involved with electronic communication. 

What part of the vulnerability assessment was challenging or helpful to you?
I struggle to adjust the .pom file to configure the necessary dependencies.  I think part of the problem I encountered was using my Mac instead of a Windows OS. I also was using different JDK versions, so I had to adjust the libraries to get the provided code to work correctly.  However, I found the solutions to my problems and made some adjustments to complete the vulnerability assessment successfully.

How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
I started with creating a simple dependency check in Maven by configuring the pom.xml file to add the dependency. Next, I added the SHA-256 encryption algorithm cipher to increase communication security.  Next, I ensured there were no errors in the code and created a suppressions.xml file to remove false positives in the dependency check report.  Next, I made some updates in my configuration, which reduced more of the vulnerable dependencies.  These different layers of security were developed in segments and improved the overall security of the project. 

How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
First, I ensured there were no errors in Eclipse when executing the program.  Once I ensured there were no code errors, I opened the localhost to confirm the code was correct.  Also, utilizing the self-signed signature, I verified the site was accessible with HTTPS. For each execution of the dependency report, I screenshotted the results and compared them to ensure no new vulnerabilities were found in the report. 

What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
StackOverflow, GeeksforGeeks, and GitHub are all resources that I utilize when I am stuck on a task.  They usually have very helpful information, tutorials, ideas, etc.. and through StackOverflow, you can post questions and will get responses from others in the field who are experienced.  I usually utilize these resources when I am needing further guidance. 

Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
That I understand secure software practices and can develop basic secure applications, I can configure plugins from the pom.xml file and generate dependency checks.  Also, create SHA-256 algorithms and self-signed signatures to access HTTPS.
