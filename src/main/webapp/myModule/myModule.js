(function(angular) {
	var module = angular.module('myModule', []);

	module.controller('myController', [ '$scope', function($scope) {
		$scope.message = "This was set from the angular controller!";
	}]);
})(window.angular);