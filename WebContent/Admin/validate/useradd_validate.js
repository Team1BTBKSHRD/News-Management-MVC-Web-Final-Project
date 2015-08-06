/*
    Form category adding validator
*/
/*$(document).ready(function() {*/
        $('#useradd').bootstrapValidator({
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
            },
            fields: {
                 
                 username: {
                    validators: {
                        notEmpty: {
                           message: 'Username is required'
                        }
                    }
                },
              password: {
                    validators: {
                        notEmpty: {
                           message: 'Password is required'
                        },
               
                    }
                },
                repassword: {
                    validators: {
                        notEmpty: {
                           message: 'Repassword is required'
                        },
                identical: {
                    field: 'password',
                    message: 'The password and its confirm are not the same'
                }
                    }
                },
                usertype: {
                    validators: {
                        notEmpty: {
                           message: 'Usertype is required'
                        }
                    }
                }
                
            }
        });
/*});*/