
var app = angular.module('listU', []);
app.controller('clistU', ['$scope', '$http', function($scope, $http){
        
        $http({
            params: '',
            method: 'GET',
            URL: 'ListarUservelet'
        })
         .then(function (data){
             $scpoe.listaUsu = data.data;
         })
         .catch(function (err){
             console.log(err);
         });
        
} ]);