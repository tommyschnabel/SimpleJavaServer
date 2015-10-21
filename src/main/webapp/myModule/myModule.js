(function(angular) {
	var module = angular.module('myModule', []);

	module.controller('myController', [ '$scope', '$http', function($scope, $http) {
		$scope.message = "This was set from the angular controller!";

        $http({
            method: 'GET',
            url: 'api/test/status'
        }).then(function(response) {
            $scope.status = response.data.status;
        });

        $scope.sendName = function() {
            $http({
                method: 'POST',
                url: 'api/test/name',
                params: {
                    name: $scope.name
                }
            }).then(function(response) {
                $scope.nameFromServer = response.data.name;
            });
        };

        $scope.throwServerError = function() {
            $http({
                method: 'GET',
                url: 'api/test'
            }).catch(function(error) {
                $scope.serverError = error;
            });
        };
	}]);
})(window.angular);