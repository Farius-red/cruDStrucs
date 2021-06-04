
var app = angular.module('listU', []);
app.controller('clistU', ['$scope', '$http', function($scope, $http){
        
        $http({
            params: '',
            method: 'GET',
            URL: 'ListarDAO'
        })
         .then(function (data){
             console.log(data);
         })
         .catch(function (err){
             console.log(err);
         });
        
} ]);