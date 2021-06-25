# xstream-poc 学习

## 前言

XStream is designed to be an easy to use library. It takes its main task seriously: converting Java objects to XML, and XML to Java objects. As a result, it is possible to create an instance of XStream with the default constructor, call a method to convert an object into XML, then call another method to turn the XML back into an equivalent Java object. By design, there are few limits to the type of objects XStream can handle.

##

| CVE                        | Description                                                                                                                                                                     |
| -------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Version 1.4.16             |                                                                                                                                                                                 |
| CVE-2021-29505             | XStream is vulnerable to a Remote Command Execution attack.                                                                                                                     |
| Version 1.4.15             |                                                                                                                                                                                 |
| CVE-2021-21341             | XStream can cause a Denial of Service.                                                                                                                                          |
| CVE-2021-21342             | A Server-Side Forgery Request can be activated unmarshalling with XStream to access data streams from an arbitrary URL referencing a resource in an intranet or the local host. |
| CVE-2021-21343             | XStream is vulnerable to an Arbitrary File Deletion on the local host when unmarshalling as long as the executing process has sufficient rights.                                |
| CVE-2021-21344             | XStream is vulnerable to an Arbitrary Code Execution attack.                                                                                                                    |
| CVE-2021-21345             | XStream is vulnerable to a Remote Command Execution attack.                                                                                                                     |
| CVE-2021-21346             | XStream is vulnerable to an Arbitrary Code Execution attack.                                                                                                                    |
| CVE-2021-21347             | XStream is vulnerable to an Arbitrary Code Execution attack.                                                                                                                    |
| CVE-2021-21348             | XStream is vulnerable to an attack using Regular Expression for a Denial of Service (ReDos).                                                                                    |
| CVE-2021-21349             | A Server-Side Forgery Request can be activated unmarshalling with XStream to access data streams from an arbitrary URL referencing a resource in an intranet or the local host. |
| CVE-2021-21350             | XStream is vulnerable to an Arbitrary Code Execution attack.                                                                                                                    |
| CVE-2021-21351             | XStream is vulnerable to an Arbitrary Code Execution attack.                                                                                                                    |
| Version 1.4.14             |                                                                                                                                                                                 |
| CVE-2020-26258             | A Server-Side Forgery Request can be activated unmarshalling with XStream to access data streams from an arbitrary URL referencing a resource in an intranet or the local host. |
| CVE-2020-26259             | XStream is vulnerable to an Arbitrary File Deletion on the local host when unmarshalling as long as the executing process has sufficient rights.                                |
| Version 1.4.13             |                                                                                                                                                                                 |
| CVE-2020-26217             | XStream can be used for Remote Code Execution.                                                                                                                                  |
| Version 1.4.9              |                                                                                                                                                                                 |
| CVE-2017-7957              | XStream can cause a Denial of Service when unmarshalling void.                                                                                                                  |
| Version 1.4.8              |                                                                                                                                                                                 |
| CVE-2016-3674              | XML External Entity (XXE) Vulnerability in XStream.                                                                                                                             |
| Version 1.4.6 (and 1.4.10) |                                                                                                                                                                                 |
| CVE-2013-7285              | XStream can be used for Remote Code Execution.                                                                                                                                  |
