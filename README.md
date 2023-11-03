# PlayerWeather

## Description

The Minecraft Weather API Plugin is a Spigot plugin for Minecraft servers that allows players to easily access real-time weather information in the game. With this plugin, players can check the current weather conditions in their Minecraft world without needing to leave the game. This can be particularly useful for planning activities, such as farming, building, or simply enjoying the weather while playing.

This plugin is licensed under the Apache 2.0 License, which means you are free to use, modify, and distribute it as long as you adhere to the terms of the license.

## Features

- Real-time weather information accessible in-game.
- Simple and intuitive commands for players to use.
- Customizable messages and permissions.
- Compatible with most Spigot-based Minecraft server versions.

## Installation

To install the Minecraft Weather API Plugin on your server, follow these steps:

1. Download the plugin's JAR file from the [Releases](https://github.com/yourusername/minecraft-weather-api/releases) page.
2. Place the JAR file in your server's `plugins` directory.
3. Start or restart your Minecraft server.

## Usage

Players can use the following commands to access weather information in-game:

- `/weather now` - Check the current weather in your location.
- `/weather forecast` - Get a weather forecast for the next 24 hours.

By default, all players have access to these commands. However, you can configure permissions to restrict usage to specific groups or players.

## Configuration

You can customize the plugin's behavior and messages by editing the `config.yml` file located in the `plugins/MinecraftWeatherAPI` folder. Here, you can change messages, enable or disable features, and adjust permissions.

### Example Configuration:

```yaml
messages:
  current-weather: "The current weather is: %weather%"
  forecast-header: "Weather forecast for the next 24 hours:"
  permission-denied: "You do not have permission to use this command."

features:
  current-weather: true
  forecast: true

permissions:
  current-weather: "minecraftweatherapi.currentweather"
  forecast: "minecraftweatherapi.forecast"
```

## Permissions

The plugin uses the following permissions:

- `minecraftweatherapi.currentweather` - Allows access to the `/weather now` command.
- `minecraftweatherapi.forecast` - Allows access to the `/weather forecast` command.

You can grant or deny these permissions to specific players or groups using a permissions management plugin.

## Issues and Contributions

If you encounter any issues or have suggestions for improving the plugin, please visit the [Issues](https://github.com/yourusername/minecraft-weather-api/issues) section on the GitHub repository to report problems or contribute to the project.

## License

This plugin is open-source and licensed under the [Apache 2.0 License](LICENSE). You are free to use, modify, and distribute it according to the terms of this license.

## Contact

If you have any questions or need assistance with the plugin, feel free to contact us through the [GitHub repository](https://github.com/yourusername/minecraft-weather-api) or our support email at support@example.com.

Enjoy the Minecraft Weather API Plugin, and have fun exploring the weather in your Minecraft world!
