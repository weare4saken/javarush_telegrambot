# javarush_telegrambot
JavaRush Telegram bot from community

## Deployment
Deployment process as easy as possible:
Required software:
- terminal for running bash scripts
- docker
- docker-compose

to deploy application, switch to needed branch and run bash script:

$ bash start.sh ${bot_username} ${bot_token}

## Using
After deployment process 
- run in your development enviroment (Intellij IDEA or Eclipse or etc...)
file javarush-telegrambot-0.3.1-SNAPSHOT in target folder;
- open telegram app and find there @test_HighlandProger_bot;
- start using from command /start

To stop running and clean target folder run bash script:

$ bash stop.sh



