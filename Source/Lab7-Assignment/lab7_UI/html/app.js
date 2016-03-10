/**
 * Created by sreeram on 3/9/16.
 */
var app = angular.module('starter1', []);
var userData;
app.controller('cont' ['$scope','state','$location', '$http', function ($scope, $location,$http) {
    $scope.login = function (username, password) {

        var url = "http://localhost:8080/Ase_Lab7/labuser/assignmentuser";
        //Read the database to check for the user.
        var res = $http.get(url+"?username="+username+"&password="+password);

        res.success(function(result, status, headers, config) {
            if (result.length = 1) {
                userData = result[0];//contains the details of the logged in user.
                $state.go = 'home.html';
            } else {
                alert('Sorry, check your credentials.')
            }
        });
        res.error(function(result, status, headers, config) {
            console.log(result);
        });

    }
}])