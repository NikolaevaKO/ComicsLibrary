angular.module('demo', [])
    .controller('Author', function($scope, $http) {
        $http.get('http://rest-service.guides.spring.io/author').
        then(function(response) {
            $scope.author = response.data;
        });
    });