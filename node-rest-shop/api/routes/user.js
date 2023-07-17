const express = require('express');
const router = express.Router();


const UsersController = require('../controllers/users');
const User = require('../models/user');
const { token } = require('morgan');

router.post('/login', UsersController.user_login);

router.post('/signup', UsersController.user_signup);

router.delete('/:userId', UsersController.user_delete);
module.exports = router;