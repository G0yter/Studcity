<#import "parts/common.ftl" as c>


<@c.page>
    <form action="/login" method="post">
        <div><label> Username </label> <input type="text" name="username" placeholder="Username"></div>
        <div><label> Password </label> <input type="password" name="password" placeholder="Username"></div>
        <input type="hidden" name="_csrf" value="{{_csrf.token}}"/>
        <div><input type="submit" value="Sign in"></div>
    </form>

    <a href="/registration">Sign up</a>
</@c.page>
