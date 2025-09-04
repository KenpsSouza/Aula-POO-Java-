# UML Diagram for Football System

## Classes

### Player
- **Attributes**
  - `name: String`
  - `age: int`
  - `position: String`
  
- **Methods**
  - `getName(): String`
  - `getAge(): int`
  - `getPosition(): String`

### Team
- **Attributes**
  - `teamName: String`
  - `players: List<Player>`
  
- **Methods**
  - `addPlayer(player: Player): void`
  - `getPlayers(): List<Player>`

### Match
- **Attributes**
  - `teamA: Team`
  - `teamB: Team`
  - `scoreA: int`
  - `scoreB: int`
  
- **Methods**
  - `startMatch(): void`
  - `endMatch(): void`
  - `getScore(): String`

### Referee
- **Attributes**
  - `name: String`
  
- **Methods**
  - `issueCard(player: Player, cardType: String): void`

## Inheritance
- `Goalkeeper` extends `Player`
- `Defender` extends `Player`
- `Midfielder` extends `Player`
- `Forward` extends `Player`

## Interfaces
### Playable
- `play(): void`