#import ..partscommon.ftl as c
@c.page
    h1 style=color chartreuseDelete dormitory.h1
    form method=post action=deleteGroup
        input type=hidden value=${group.getId()} name=id
        div class=form-group
            button type=submit class=btn btn-primaryDelete group ${group.getCipher()}button
        div
    form
    a href=groups class=card-linkBacka

    h5You delete every Student by deleting his group! Be carefulh5
@c.page