<#import "parts/common.ftl" as c>

<@c.page>
    <h1>Registration</h1>
    <form method="post" action="/registration" >
        <div><label> Username </label> <input type="text" name="username" placeholder="Username"></div>
        <div><label> Password </label> <input type="password" name="password" placeholder="Password"></div>
        <div><input type="submit" value="Sign up!"></div>
    </form>
</@c.page>
